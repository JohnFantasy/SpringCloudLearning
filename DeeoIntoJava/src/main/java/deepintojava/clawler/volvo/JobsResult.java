package deepintojava.clawler.volvo;

import lombok.Data;

@Data
public class JobsResult {

    private JobStatus jobStats;

    private JobDesc[] jobs;
}
