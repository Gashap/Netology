package ru.netology.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.netology.domain.Operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class StatementService {
	private final Map<Integer, List<Operation>> storage = new HashMap<>();

//	public void saveOperation(Operation operation){
//		List<Operation> operations = storage.get(operation.getCustomersId());
//		if (operations == null){
//			List<Operation> customerOperations = new ArrayList<>();
//			customerOperations.add(operation);
//			storage.put(operation.getCustomersId(), customerOperations);
//		} else operations.add(operation);
//	}

	public Map<Integer, List<Operation>> getStatement() {
		return storage;
	}

	public List<Operation> getCustomerOperations(int customerId) {
		return storage.containsKey(customerId) ? storage.getOrDefault(customerId, List.of()) : null;
	}

	public Operation getOperation(int clientId, int operationIndex){
		return storage.get(clientId).get(operationIndex);
	}

	public void setOperation(int clientId, Operation operation) {
		List<Operation> operations = storage.getOrDefault(clientId, new ArrayList<>());
		operations.add(operation);
		storage.put(clientId, operations);
	}
}
