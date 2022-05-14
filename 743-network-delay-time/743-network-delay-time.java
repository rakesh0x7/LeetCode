class Node {
    int dest;
    int weight;
    Node(int d, int w){
        dest = d;
        weight = w;
    }
} 
class Solution {
    
    public int networkDelay(HashMap<Integer, List<Node>> map, int n, int k){
        
        int []visited = new int[n+1];
        Arrays.fill(visited,101 );
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        visited[k] = 0;
        while(!queue.isEmpty()){
            int t = queue.poll();
            if(map.get(t)==null)
                continue;
            List<Node> temp = map.get(t);
            for(int i=0;i<temp.size();i++){
                if(visited[temp.get(i).dest]==101||visited[t]+temp.get(i).weight<visited[temp.get(i).dest])
                    queue.add(temp.get(i).dest);
                visited[temp.get(i).dest] = Math.min(visited[temp.get(i).dest],temp.get(i).weight + visited[t]);
                
            }
        }
        int max=0;
        for(int i=1;i<visited.length;i++){
            if(visited[i]==101)
                return -1;
            else max = Math.max(visited[i], max);
        }
        return max;
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<Node>> map = new HashMap<>();
        for(int i=0;i<times.length;i++){
            Node node = new Node(times[i][1], times[i][2]);
            if(map.get(times[i][0])==null){
                map.put(times[i][0], new ArrayList<>());
            }
            map.get(times[i][0]).add(node);
        }
        int ans = networkDelay(map, n,k);
        return ans;
    }
}