public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    int n = 2, m = 5, k = 10;
    for(int i=0; i<n; i++){
        ArrayList<Integer> innerList = new ArrayList<Integer>();
        for(int j=0; j<m; j++){
            innerList.add(k);
        }
        a.add(innerList);
    }
}