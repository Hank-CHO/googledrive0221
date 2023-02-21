package untitled.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "dashboards",
    path = "dashboards"
)
public interface DashboardRepository
    extends PagingAndSortingRepository<Dashboard, Long> {
    List<Dashboard> findByVideoUrl(String videoUrl);
}
