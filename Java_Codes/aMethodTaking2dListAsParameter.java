public static void printList(ArrayList<ArrayList<Integer>> a){
    int row = a.size();
    int col = a.get(0).size();
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(a.get(i).get(j) + " ");
        }
        System.out.println();
    }
}