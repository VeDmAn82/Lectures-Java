package Lecture4;

public class lecture4 {
    
}
// Приоритетные коллекции
// LinkedList
// Представляет собой двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять
// свой размер. Элементы доступны для вставки или удаления в
// любой позиции.

// LinkedList. Список
// Мотивация.
// LinkedList нужен для небольшого количества
// элементов, в которых операции добавления\удаления
// встречаются чаще операций чтения.

import java.util.*;
public class Ex002_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue); // [2809]
    }
}

import java.util.*;
public class Ex002_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
        queue.remove(2809); // зачем очередь??
        queue.element()
        queue.peek()
    }
}

PriorityQueue
// Наивысший приоритет имеет «наименьший» элемент.

Deque
// Линейная коллекция, которая поддерживает вставку и удаление
// элементов на обоих концах.

import java.util.*;
public class Ex003_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}

Stack
// Stack представляет собой обработку данных по принципу LIFO.
// Расширяет Vector пятью операциями, которые позволяют
// рассматривать вектор как стек.
// push(E item)
// pop()

import java.util.*;
public class Ex004_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}

// Stack и Vector не рекомендованы
// к использованию