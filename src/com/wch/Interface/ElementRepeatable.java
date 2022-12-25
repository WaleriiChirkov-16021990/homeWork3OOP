package com.wch.Interface;

import java.util.HashMap;
import java.util.Map;

/**
 * For collections where the Element is repeatable
 * @param <U>
 */
public interface ElementRepeatable<U> {
	HashMap<U, Integer> getCountRepeatable();
}
