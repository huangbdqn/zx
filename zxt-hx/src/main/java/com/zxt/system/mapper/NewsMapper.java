package com.zxt.system.mapper;

import com.zxt.system.domain.News;
import java.util.List;

/**
 * 新闻Mapper接口
 * 
 * @author zxt
 * @date 2020-06-23
 */
public interface NewsMapper 
{
    /**
     * 查询新闻
     * 
     * @param newsId 新闻ID
     * @return 新闻
     */
    public News selectNewsById(Long newsId);

    /**
     * 查询新闻列表
     * 
     * @param news 新闻
     * @return 新闻集合
     */
    public List<News> selectNewsList(News news);

    /**
     * 新增新闻
     * 
     * @param news 新闻
     * @return 结果
     */
    public int insertNews(News news);

    /**
     * 修改新闻
     * 
     * @param news 新闻
     * @return 结果
     */
    public int updateNews(News news);

    /**
     * 删除新闻
     * 
     * @param newsId 新闻ID
     * @return 结果
     */
    public int deleteNewsById(Long newsId);

    /**
     * 批量删除新闻
     * 
     * @param newsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNewsByIds(String[] newsIds);
}
