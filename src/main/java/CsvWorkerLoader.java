import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvWorkerLoader implements WorkerLoader{
    private final File file;

    public CsvWorkerLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Worker> load() {
        try{
            return load(new FileReader(file));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private List<Worker> load(FileReader reader) throws IOException{
        return load(new BufferedReader(reader));
    }

    private List<Worker> load(BufferedReader reader) throws IOException{
        reader.skip(1);
        List<Worker> workers = new ArrayList<>();
        while (true){
            String line = reader.readLine();
            if(line == null) return workers;
            workers.add(toWorker(line.split(",")));
        }
    }

    private Worker toWorker(String[] split) {
        return new Worker(
                split[0],
                split[1],
                split[2],
                split[3],
                split[4],
                split[5],
                split[6]
        );
    }
}
