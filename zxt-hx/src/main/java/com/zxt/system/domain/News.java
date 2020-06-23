package com.zxt.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zxt.common.annotation.Excel;
import com.zxt.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 新闻对象 news
 * 
 * @author zxt
 * @date 2020-06-23
 */
public class News extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long newsId;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 访问量 */
    @Excel(name = "访问量")
    private String visits;

    /** 发表时间 */
    @Excel(name = "发表时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 备用1 */
    @Excel(name = "备用1")
    private String backupone;

    /** 备用2 */
    @Excel(name = "备用2")
    private String backuptwo;

    /** 备用3 */
    @Excel(name = "备用3")
    private String backupthree;

    public void setNewsId(Long newsId) 
    {
        this.newsId = newsId;
    }

    public Long getNewsId() 
    {
        return newsId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setVisits(String visits) 
    {
        this.visits = visits;
    }

    public String getVisits() 
    {
        return visits;
    }
    public void setAddTime(Date addTime) 
    {
        this.addTime = addTime;
    }

    public Date getAddTime() 
    {
        return addTime;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setBackupone(String backupone) 
    {
        this.backupone = backupone;
    }

    public String getBackupone() 
    {
        return backupone;
    }
    public void setBackuptwo(String backuptwo) 
    {
        this.backuptwo = backuptwo;
    }

    public String getBackuptwo() 
    {
        return backuptwo;
    }
    public void setBackupthree(String backupthree) 
    {
        this.backupthree = backupthree;
    }

    public String getBackupthree() 
    {
        return backupthree;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("newsId", getNewsId())
            .append("title", getTitle())
            .append("visits", getVisits())
            .append("addTime", getAddTime())
            .append("content", getContent())
            .append("backupone", getBackupone())
            .append("backuptwo", getBackuptwo())
            .append("backupthree", getBackupthree())
            .toString();
    }
}
