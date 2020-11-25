package com.projet;

import sun.management.snmp.jvmmib.JvmRTInputArgsEntryMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Calculator {

        public int sum(int a, int b) {
            return a + b;
        }

        public int minus(int a, int b) {
            return a - b;
        }

        public int divide(int a, int b) {
            return a / b;
        }

        public int multiply(int a, int b) {
            return a * b ;
        }

        public int min(int a, int b){
            return Math.min(a,b);
        }

        public int max(int a, int b){
            return Math.max(a,b);
        }



}