import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkerLoader workerLoader= new CsvWorkerLoader(new File("resuelto2.csv"));
        List<Worker> workers = workerLoader.load();
        System.out.println("Trabajadores tienda n8:");
        for(Worker worker: workers){
            String name = worker.getTrabajador();
            String tienda = worker.getNtienda();
            if(tienda.equals("8")){
                System.out.println(name);
            }
        }
    }
}
