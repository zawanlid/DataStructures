package com.structures.linkedlist;

import java.util.NoSuchElementException;

/**
 * 
 * @author dil.nawaz
 * 
 *         addFirst addLast deleteFirst deleteLast contains indexOf
 *
 * @param <T>
 */
public class CustomLinkedList<T> {

	private class Node {
		private T value;
		private Node next;

		Node(T value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;
	private int size = 0;

	public void addFirst(T value) {
		Node node = new Node(value);

		if (first == null) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}

		size++;
	}

	public void addLast(T value) {
		Node node = new Node(value);

		if (first == null) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}

		size++;

	}

	/**
	 * This is equivalent to addLast
	 * 
	 * @param value
	 */
	public void add(T value) {
		addLast(value);
	}

	public void deleteFirst() {
		if (first == null)
			throw new NoSuchElementException();
		
		if (first == last) {
			first = last = null;
			size--;
			return;
		}
		
		Node node = first.next;
		first.next = null;
		first = node;
		size--;
	}

	public void deleteLast() {
		if (first == null)
			throw new NoSuchElementException();
		if (first == last) {
			first = last = null;
			size--;
			return;
		}

		Node previous = getPrevious(last);
		previous.next = null;
		last = previous;
		size--;
	}
	
	public int indexOf (T value) {
		Node current = first;
		int index = 0;
		
		while (current != null) {
			if (current.value == value)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}

	public boolean contains (T value) {
		return indexOf(value) != -1;
	}
	
	private Node getPrevious (Node node) {
		Node previous = first;

		while (previous != null) {
			if (previous.next == node)
				break;
			previous = previous.next;
		}
		
		return previous;
	}

	public void reverse () {

		if (isEmpty()) return;

		Node previous = first;
		Node current = first.next;

		while (current != null) {

			Node temp = current.next;

			current.next = previous;
			previous = current;
			current = temp;
		}

		last = first;
		last.next = null;
		first = previous;
	}

	public boolean isEmpty () {
		return first == null;
	}

	public int [] toIntegerArray () {
		int arr[] = new int[getSize()];
		Node current = first;

		for (int i=0; i< getSize(); i++) {
			arr[i] = (Integer) current.value;
			current = current.next;
		}
		return arr;
	}

	public int getSize () {
		return this.size;
	}

	public T findKthNode (int i) {

		if (isEmpty()) return null;
		if (i < 1 || i > size)
			throw new NoSuchElementException();

		Node k = first;
		Node e = first;

		for (int a=0; a<i-1; a++) {
			e = e.next;
		}

		while (e.next != null) {
			k = k.next;
			e = e.next;
		}
		return  k.value;
	}
}
