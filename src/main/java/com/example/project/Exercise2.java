package com.example.project;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.existenDuplicados(s));
        }
    }

    public boolean existenDuplicados(String str) {
        MyStack<Character> stack = new LinkedListStack<>();
        // Colocar codigo aqui
        for(int i=0; i<str.length(); i++) {
        	char aux = str.charAt(i);
        	if(aux!=' ') {
        		if (aux != ')')
        			stack.push(aux);
        		else {
        			boolean vacio = true;
        			while(stack.pop() != '(') {
        				vacio = false;
        			}
        			if(vacio)
        				return true;
        		}	
        	}
        }
        return false;    
    }
}