import java.util.*;

public class Main {
    public static void main(String[] args) {
        topologicalSort logisticsGraph = new topologicalSort();

        logisticsGraph.addVertex("preheat oven");
        logisticsGraph.addVertex("preheat pan");
        logisticsGraph.addVertex("bake bread");
        logisticsGraph.addVertex("serve bread");
        logisticsGraph.addVertex("eat");
        logisticsGraph.addVertex("set plate");
        logisticsGraph.addVertex("add some pickles");
        logisticsGraph.addVertex("add krabby patty");
        logisticsGraph.addVertex("serve patty");
        logisticsGraph.addVertex("add tartar sauce");
        logisticsGraph.addVertex("pour sauce over patty");



        logisticsGraph.addEdge("preheat oven", "bake bread");
        logisticsGraph.addEdge("preheat oven", "preheat pan");
        logisticsGraph.addEdge("bake bread", "serve bread");
        logisticsGraph.addEdge("serve bread", "eat");
        logisticsGraph.addEdge("preheat pan", "set plate");
        logisticsGraph.addEdge("add some pickles", "eat");
        logisticsGraph.addEdge("preheat pan", "add krabby patty");
        logisticsGraph.addEdge("set plate", "serve bread");
        logisticsGraph.addEdge("set plate", "add some pickles");
        logisticsGraph.addEdge("set plate", "serve patty");
        logisticsGraph.addEdge("add kraby patty", "serve patty");
        logisticsGraph.addEdge("add krabby patty", "add tartar sauce");
        logisticsGraph.addEdge("serve patty", "pour sauce over patty");
        logisticsGraph.addEdge("add tartar sauce", "pour sauce over patty");
        logisticsGraph.addEdge("pour sauce over patty", "eat");






        List<String> urutanTugas = logisticsGraph.topologicalSort();

        if (urutanTugas != null) {
            System.out.println("Urutan pengerjaan tugas persiapan drama: " + urutanTugas);
        }
    }
}
