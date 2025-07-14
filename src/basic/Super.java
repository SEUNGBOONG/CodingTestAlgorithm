package basic;

class Super {
    Super() {
        System.out.println('A');
    }

    Super(char x) {
        System.out.println('X');
    }

}

class Sub extends Super {
    Sub() {
        super();
        System.out.println('B');
    }

    Sub(char x) {
        super(x);
        System.out.println('X');
    }

    public static void main(String[] args) {
        Super s = new Super('C');
        Super s1 = new Sub('x');
    }
}


