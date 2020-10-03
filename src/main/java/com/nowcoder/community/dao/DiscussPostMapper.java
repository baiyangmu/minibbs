package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {


    List<DiscussPost> selectDiscussPosts(int userId , int offset , int limit);//开发个人主页中“我发布的帖子”的功能 ,offset表示起始行号，limit表示显示多少数据

    //@Param注解用于给参数取别名
    //如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId")  int userId);


    int insertDiscussPost(DiscussPost  discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id , int commentCount);
}
