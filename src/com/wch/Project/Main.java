package com.wch.Project;

/*
Составить частотный словарь элементов массива
Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.
Пример:
Есть набор данных
```
{ 1, 9, 9, 0, 2, 8, 0, 9 }
```
частотный массив может быть представлен так:
```
0 встречается 2 раза
1 встречается 1 раз
2 встречается 1 раз
8 встречается 1 раз
9 встречается 3 раза
```
Если набор данных - таблица
```
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		MyObject myObject = new MyObject(new ArrayList<>(Arrays.asList("1","2","3","4","3","2","2")));
		new Printer(myObject).printObj();
		MyObject myObject1 = new MyObject(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,3,2,2,1)));
		new Printer(myObject1).printObj();
	}
}