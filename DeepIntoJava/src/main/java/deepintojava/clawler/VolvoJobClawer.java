package deepintojava.clawler;

import cn.hutool.http.HttpUtil;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import deepintojava.clawler.volvo.JobDesc;
import deepintojava.clawler.volvo.JobsResult;
import deepintojava.clawler.volvo.VolvoResponse;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VolvoJobClawer {

    public static void main(String[] args) {
        String post1 = HttpUtil.post("https://app.mokahr.com/api/outer/ats-jc-apply/website/jobs",
                "{\"limit\":1000,\"offset\":1,\"zhinengId\":\"85215\",\"isCampusJob\":\"0\",\"siteId\":56035,\"orgId\":\"volvocars\",\"site\":\"recommendation\",\"needStat\":true}");
        Gson gson = new Gson();
        Type type = new TypeToken<VolvoResponse<JobsResult>>() {
        }.getType();
        VolvoResponse<JobsResult> volvoResponse = gson.fromJson(post1, type);
        JobsResult jobsResult = volvoResponse.getData();
        JobDesc[] jobs = jobsResult.getJobs();
        List<JobDesc> collect = Arrays.stream(jobs).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
