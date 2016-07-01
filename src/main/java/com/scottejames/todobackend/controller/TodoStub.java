package com.scottejames.todobackend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.scottejames.todobackend.model.TodoItem;


public class TodoStub {

	private static Map<Long, TodoItem> todoitems = new HashMap<Long, TodoItem>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		TodoItem tOne = new TodoItem(1L, "Do some work");
		todoitems.put(1L, tOne);
		TodoItem tTwo = new TodoItem(2L, "Do some work Again");
		todoitems.put(2L, tTwo);
		TodoItem tThree = new TodoItem(3L, "Do some work Finally");
		todoitems.put(3L, tThree);
	}

	public static List<TodoItem> list() {
		return new ArrayList<TodoItem>(todoitems.values());
	}

	public static TodoItem create(TodoItem item) {
		idIndex += idIndex;
		item.setId(idIndex);
		todoitems.put(idIndex, item);
		return item;
	}

	public static TodoItem get(Long id) {
		return todoitems.get(id);
	}

	public static TodoItem update(Long id, TodoItem wreck) {
		todoitems.put(id, wreck);
		return wreck;
	}

	public static TodoItem delete(Long id) {
		return todoitems.remove(id);
	}
}
