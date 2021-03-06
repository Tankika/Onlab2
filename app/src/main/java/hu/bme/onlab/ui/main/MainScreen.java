package hu.bme.onlab.ui.main;

import java.util.List;

import hu.bme.onlab.model.post.Post;
import hu.bme.onlab.ui.common.ScreenWithLoader;

public interface MainScreen extends ScreenWithLoader {

    void setMenuVisibilities();

    void clearPostList();

    void refreshPostList(List<Post> posts);
}
