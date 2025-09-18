class VarArgsDemo {
    static void fun2(String str, int... a)
    {
        System.out.println("String: " +str);
        System.out.println("Number of arguments is: " + a.length);


        //using for each loop
        for (int i : a) {
            System.out.print(i+ " ");
            System.out.println();
        }
    }   
        public static void main(String args[])
        {
            //calling fun2 with different parameter
            fun2("North Cap University",100,200);
            fun2("BTech 2nd year", 1, 2, 3, 4, 5);
            fun2("Intro to java");
        }
    }

