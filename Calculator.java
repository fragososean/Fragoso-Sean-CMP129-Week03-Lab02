public class Calculator {
    
        private int A1, A2, C1, C2, C3;
        private int sum1, sum3;
        private double B1, B2;
        private double sum2;
        private String W1, W2;
        private String con;

        public void setA1(int a1){
            A1 = a1;
        }

        public void setA2(int a2){
            A2 = a2;
        }
        
        public void setC1(int c1){
            C1 = c1;
        }

        public void setC2(int c2){
            C2 = c2;
        }

        public void setC3(int c3){
            C3 = c3;
        }

        public void setB1(double b1){
            B1 = b1;
        }

        public void setB2(double b2){
            B2 = b2;
        }

        public void setW1(String w1){
            W1 = w1;
        }

        public void setW2(String w2){
            W2 = w2;
        }
    
        public void add1(){
            sum1 = A1 + A2;
            System.out.println("Sum: "+sum1);
        }

        public void add2(){
            sum2 = B1+B2;
            System.out.println("Sum: "+sum2);
        }

        public void add3(){
            sum3 = C1 + C2 + C3;
            System.out.println("Sum: "+sum3);
        }

        public void con(){
            System.out.print("Concatenation: "+(W1 + W2));
        }
    
}
