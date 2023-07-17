// public boolean dfsCycle(ArrayList<ArrayList<Integer>> graph,boolean
// visted[],boolean stack[],int cur){
// visted[cur]=true;
// stack[cur]=true;

// for(int i=0;i<graph.get(cur).size();i++){
// int n = graph.get(cur).get(i);
// if(stack[n]==true){
// return true;
// }
// if(!visted[n] && dfsCycle(graph,visted,stack,n)){
// return true;
// }
// }
// stack[cur] =false;
// return false;

// }

/// main logic