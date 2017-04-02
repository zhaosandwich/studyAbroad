package itouchtv.domain.repository;

import itouchtv.domain.TopicEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhouliangchou on 2016/12/9.
 */

public interface ActivityRepository extends CrudRepository<TopicEntity, Long> {

}
