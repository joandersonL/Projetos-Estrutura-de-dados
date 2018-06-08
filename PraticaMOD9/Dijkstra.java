import java.util.PriorityQueue;

// Algoritmo de Dijkstra
public class Dijkstra {
	final Graph g; 
	final int n; 
	final int source; 
	final int dest; 
	Fenetre f;

	int[] dist;
	int[] pred;
	boolean[] settled;
	PriorityQueue<Node> naoacomodados;

	// construtor
	Dijkstra(Graph g, int source, int   dest) {
		this.g = g;
		n = g.n;
		this.source = source;
		this.dest = dest;
		dist = new int[n];
		pred = new int[n];
		for(int i=0; i<n;i++)
			dist[i] = Integer.MAX_VALUE;
		dist[source] = 0;
		for(int i=0;i<n;i++)
			pred[i]= 0;	
	}
	
	// atualizacao da distancia, da prioridade, e do predecessor de um no
	void update(int y, int x) { //distancia -> origem
		int custoAtual = dist[y];
		int novoCusto = dist[x] + g.value(x,y);
		if(novoCusto < custoAtual){
			dist[y] = novoCusto;
			naoacomodados.add(new Node(y, novoCusto));
		}
			
	}
	
	// retorna o próximo nó a ser acomodado
	int nextNode() {
		int menor = naoacomodados.pull();
		if(settled[menor] == false)
			return menor;
		else{
			//percorrer até encontrar um nó que não esteja acomodado
		}
		if(naoacomodados.isEmpty())
			return -1;
	}
	
	// uma etapa do algoritmo de Dijkstra
	//parar ao acomodar o no de destino e caso a lista de naoacomodados seja vazia
	int oneStep() {
		int noAtual = nextNode();
		settled[noAtual] = true;
		ArrayList<Integer> vizinhos = g.successors(noAtual);
		for(){
			update(i,noAtual);
		}
		return noAtual;
	}
	
	// algoritmo de Dijsktra completo
	int compute() {
		while(oneStep() != -1 && oneStep() != source){
			oneStep();
		}
		return dist[dest];
	}
	
	// desacelera o visualizador
	void slow(){
	    if(f == null) return;
	    try {
	        Thread.sleep(5);
	    } catch (InterruptedException e) {}
	}
}
