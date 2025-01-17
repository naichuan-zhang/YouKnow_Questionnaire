package com.questionnaire.standard;

import org.springframework.stereotype.Component;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Component("standardUtil")
public class Util {

    public String getPageHtml(Integer page, Integer lastPage) {
        StringBuffer sb = new StringBuffer("<nav style=\"text-align: center;\">"
                + "<ul class=\"pagination pagination-lg\">\n");
        if (page == 1){
            sb.append("<li class=\"disabled\">"
                    + "<a href=\"javascript:void(0)\" aria-label=\"Previous\">"
                    + "<span aria-hidden=\"true\">&laquo;"
                    + "</span>"
                    + "</a>"
                    + "</li>\n");
        }else{
            sb.append("<li >"
                    + "<a href=\"?page="+(page-1)+"\" aria-label=\"Previous\">"
                    + "<span aria-hidden=\"true\">&laquo;"
                    + "</span>"
                    + "</a>"
                    + "</li>\n");
        }
        if ((lastPage-page+1) >=5){
            for (int i = page ; i < page+5;i++){
                if (i==page){//如果是第一页那么会有一个class样式
                    sb.append("<li class=\"active\">"
                            + "<a href=\"?page="+i+"\">"+i+"</a>"
                            + "</li>\n");
                }else
                    sb.append("<li >"
                            + "<a href=\"?page="+i+"\">"+i+"</a>"
                            + "</li>\n");
            }
        }else if(lastPage-4 > 0){
            for (int i = lastPage-4 ; i <= lastPage;i++){

                if (i==page){//如果是第一页那么会有一个class样式
                    sb.append("<li class=\"active\">"
                            + "<a href=\"?page="+i+"\">"+i+"</a>"
                            + "</li>\n");
                }else
                    sb.append("<li >"
                            + "<a href=\"?page="+i+"\">"+i+"</a>"
                            + "</li>\n");
            }
        }else{
            for (int i = 1 ; i <= lastPage;i++){

                if (i==page){//如果是第一页那么会有一个class样式
                    sb.append("<li class=\"active\">"
                            + "<a href=\"?page="+i+"\">"+i+"</a>"
                            + "</li>\n");
                }else
                    sb.append("<li >"
                            + "<a href=\"?page="+i+"\">"+i+"</a>"
                            + "</li>\n");
            }
        }
        if (page != lastPage){
            sb.append("<li >"
                    + "<a href=\"?page="+(page+1)+"\" aria-label=\"Next\">"
                    + "<span aria-hidden=\"true\">&raquo;</span>"
                    + "</a>"
                    + "</li>"
                    + "</ul>"
                    + "</nav>\n");
        }else{
            sb.append("<li class=\"disabled\">"
                    + "<a href=\"javascript:void(0)\" aria-label=\"Next\">"
                    + "<span aria-hidden=\"true\">&raquo;</span>"
                    + "</a>"
                    + "</li>"
                    + "</ul>"
                    + "</nav>\n");
        }

        return sb.toString();
    }
}
