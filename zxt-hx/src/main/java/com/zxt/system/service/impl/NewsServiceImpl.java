package com.zxt.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zxt.system.mapper.NewsMapper;
import com.zxt.system.domain.News;
import com.zxt.system.service.INewsService;
import com.zxt.common.core.text.Convert;

/**
 * 新闻Service业务层处理
 * 
 * @author zxt
 * @date 2020-06-23
 */
@Service
public class NewsServiceImpl implements INewsService 
{
    @Autowired
    private NewsMapper newsMapper;

    /**
     * 查询新闻
     * 
     * @param newsId 新闻ID
     * @return 新闻
     */
    @Override
    public News selectNewsById(Long newsId)
    {
        return newsMapper.selectNewsById(newsId);
    }

    /**
     * 查询新闻列表
     * 
     * @param news 新闻
     * @return 新闻
     */
    @Override
    public List<News> selectNewsList(News news)
    {
        return newsMapper.selectNewsList(news);
    }

    /**
     * 新增新闻
     * 
     * @param news 新闻
     * @return 结果
     */
    @Override
    public int insertNews(News news)
    {
        return newsMapper.insertNews(news);
    }

    /**
     * 修改新闻
     * 
     * @param news 新闻
     * @return 结果
     */
    @Override
    public int updateNews(News news)
    {
        return newsMapper.updateNews(news);
    }

    /**
     * 删除新闻对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNewsByIds(String ids)
    {
        return newsMapper.deleteNewsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新闻信息
     * 
     * @param newsId 新闻ID
     * @return 结果
     */
    @Override
    public int deleteNewsById(Long newsId)
    {
        return newsMapper.deleteNewsById(newsId);
    }
}
