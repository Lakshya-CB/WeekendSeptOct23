package Lec_HM_Graph_Big;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HHashMap<K, V>V1, HashMap<V2,Wt>>
	HashMap<Integer, HashMap<Integer, Integer>> HM;

	public Graph(int initial) {
		HM = new HashMap<>();
		// TODO Auto-generated constructor stub
		for (int cnt = 1; cnt <= initial; cnt++) {
			HM.put(cnt, new HashMap<>());
		}
	}

	public Graph() {
		this(5);
	}

	public void addEdge(int V1, int V2, int Wt) {
		HashMap<Integer, Integer> V1_Nbrs = HM.get(V1);
		V1_Nbrs.put(V2, Wt);
		HashMap<Integer, Integer> V2_Nbrs = HM.get(V2);
		V2_Nbrs.put(V1, Wt);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> V1_Nbrs = HM.get(V1);
		V1_Nbrs.remove(V2);
		HashMap<Integer, Integer> V2_Nbrs = HM.get(V2);
		V2_Nbrs.remove(V1);
	}

	public void addUser(int V) {
		if (HM.containsKey(V)) {
			throw new RuntimeException("email id already exists!!");
		}
		HM.put(V, new HashMap<>());
	}

	public int getEdge(int V1, int V2) {
		return HM.get(V1).get(V2);
	}

	public int cntEdges() {
		int tot_E = 0;
		for (int V : HM.keySet()) {
			tot_E = tot_E + HM.get(V).size();
		}
		return tot_E / 2;
	}

	public void findPaths(int src, int dest) {
		findPaths(src, dest, "", new HashSet<>());
	}

	private void findPaths(int curr, int dest, String path, HashSet<Integer> Set) {
		if (curr == dest) {
			System.out.println(path + curr);
			return;
		}
		Set.add(curr);
		for (int nbr : HM.get(curr).keySet()) {
			if (!Set.contains(nbr)) {
				findPaths(nbr, dest, path + curr, Set);
			}
		}
		Set.remove(curr);
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		HashSet<Integer> Visited = new HashSet<>();
		Q.add(src);
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			if (Visited.contains(curr)) {
				System.out.println("cycle !! cycle!!");
			}
			Visited.add(curr);
			for (int nbr : HM.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
		HashSet<Integer> Visited = new HashSet<>();
		int numOfCom = 0;
		for (int V : HM.keySet()) {
			if(Visited.contains(V)) {
				continue;
			}
			numOfCom++;
			Queue<Integer> Q = new LinkedList<>();
			Q.add(V);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				if (Visited.contains(curr)) {
					System.out.println("cycle !! cycle!!");
				}
				Visited.add(curr);
				for (int nbr : HM.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}
		System.out.println(numOfCom);
	}
	class DijPair{
		int V;
		int effWt;
		public DijPair(int VV, int WW) {
			V = VV;
			effWt = WW;
		}
	}
	public void Dijkstra(int src) {
		HashSet<Integer> Visited = new HashSet<>();
		PriorityQueue<DijPair> PQ =new PriorityQueue<>((a,b)-> a.effWt-b.effWt);
//		PQ.add(null)
		PQ.add(new DijPair(src, 0));
		while(!PQ.isEmpty()) {
			DijPair curr = PQ.poll();
			if(Visited.contains(curr.V)) {
				continue;
			}
			System.out.println(src + " to "+curr.V +"=>"+curr.effWt);
			Visited.add(curr.V);
			for(int nbr : HM.get(curr.V).keySet()) {
				if(!Visited.contains(nbr)) {
					PQ.add(new DijPair(nbr, curr.effWt + getEdge(nbr, curr.V)));
				}
			}
		}
	}

}
