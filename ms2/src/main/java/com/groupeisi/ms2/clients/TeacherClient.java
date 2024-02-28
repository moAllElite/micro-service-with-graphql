package  com.groupeisi.ms2.clients;

import com.groupeisi.ms2.domain.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface TeacherClient {
    @GetMapping("/school/{school-id}")
    List<Teacher> findAllTeacherBySchoolId(@PathVariable("school-id") Long schoolId);
}
