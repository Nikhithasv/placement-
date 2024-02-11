//using arrays

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        char[] a = {'b', 'a', 't', 'r'};
        char[] b = {'t', 'r', 'e', 'e'};
        int k = 0;
        char[] r = new char[(a.length + b.length) ];
        for (int i = 0; i < a.length; i++) {
            r[k] = a[i];
            k++;
        }

        if (a[a.length -1] == b[0]) {
            for (int i = 1; i < b.length; i++) {
                r[k] = b[i];
                k++;
            }
        } else {
            
            for (int i =0; i <b.length; i++) { 
                r[k] = b[i];
                k++;
            }
        }

        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }

    }
}
// using string

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        String a="bat";
        String b="tree";
        String r="";
        int k = 0;
        for (int i = 0; i < a.length(); i++) {
            r+=a.charAt(i);
            k++;
        }

        if (a.charAt(a.length()-1) == b.charAt(0)) {
            for (int i = 1; i < b.length(); i++) {
                r+=b.charAt(i);
                k++;
            }
        } else {
            
            for (int i =0; i <b.length(); i++) { 
                 r+=b.charAt(i);
                k++;
            }
        }
        System.out.print(r);

    }
}

