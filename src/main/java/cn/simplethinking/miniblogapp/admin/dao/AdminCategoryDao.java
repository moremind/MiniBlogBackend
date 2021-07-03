package cn.simplethinking.miniblogapp.admin.dao;

import cn.simplethinking.miniblogapp.admin.entity.AdminCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
@Mapper
@Component
public interface AdminCategoryDao {


    boolean insertCategory(AdminCategory category);
}
