package com.example.feign;

public class User
{
    private long userId;
    private long id;
    private String title;
    private String completed;

    public User()
    {
    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(final long userId)
    {
        this.userId = userId;
    }

    public long getId()
    {
        return id;
    }

    public void setId(final long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(final String title)
    {
        this.title = title;
    }

    public String getCompleted()
    {
        return completed;
    }

    public void setCompleted(final String completed)
    {
        this.completed = completed;
    }
}
