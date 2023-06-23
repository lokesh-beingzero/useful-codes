public int findRepeatedNumber(List<Integer> a){
    int freq[] = new int[100001];
    int n = a.size();
    for(int i=0; i<n; i++){
        freq[a.get(i)]++;
    }
    int repeatedNumber = 0;
    for(int i=0; i<100001; i++){
        if(freq[i] == 2){
            repeatedNumber = i;
            break;
        }
    }
    return repeatedNumber;
}
