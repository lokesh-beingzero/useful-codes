public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[2][4];
    for(int i=0; i<2; i++){
        for(int j=0; j<4; j++){
            a[i][j] = sc.nextInt();
        }
    }
}