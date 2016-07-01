package com.scottejames.todobackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scottejames.todobackend.model.TodoItem;

@RestController
public class TodoController {

	@RequestMapping(value = "todos", method = RequestMethod.GET)
	public List<TodoItem> list() {
		return TodoStub.list();

	}

	// Create
	@RequestMapping(value = "todos", method = RequestMethod.POST)
	public TodoItem create(@RequestBody TodoItem wreck) {
		return TodoStub.create(wreck);
	}

	// Get
	@RequestMapping(value = "todos/{id}", method = RequestMethod.GET)
	public TodoItem get(@PathVariable Long id) {
		return TodoStub.get(id);
	}

	// Update
	@RequestMapping(value = "todos/{id}", method = RequestMethod.PUT)
	public TodoItem create(@PathVariable Long id, @RequestBody TodoItem wreck) {
		return TodoStub.update(id, wreck);
	}

	// Delete
	// Get
	@RequestMapping(value = "todos/{id}", method = RequestMethod.DELETE)
	public TodoItem delete(@PathVariable Long id) {
		return TodoStub.delete(id);
	}

}
