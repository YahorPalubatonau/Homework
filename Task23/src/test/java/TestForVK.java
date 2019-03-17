import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.utils.URIBuilder;
import org.junit.Assert;
import org.junit.Test;

public class TestForVK {


    @Test
    public void checkAddCommitOnWall() {
        URIBuilder builderForCommit = СreatorForBuilder.createBuilder("post")
                .setParameter("message", "ДА ПРИБУДЕТ С НАМИ СИЛА!");
        HttpResponse httpResponse = СreatorForBuilder.getResponse(builderForCommit);
        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void checkEditCommit() {
        URIBuilder builderForEdit = СreatorForBuilder.createBuilder("post")
                .setParameter("message", "ДА ПРИБУДЕТ С НАМИ СИЛА!");
        String postId = СreatorForBuilder.getPostID(builderForEdit);
        СreatorForBuilder.createBuilder("edit")
                .setParameter("post_id", postId)
                .setParameter("message", "ДА ПРИБУДЕТ С НАМИ БУЛЬБА!");
        HttpResponse httpResponse = СreatorForBuilder.getResponse(builderForEdit);
        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void checkDeleteCommit() {
        URIBuilder builderForDelete = СreatorForBuilder.createBuilder("post")
                .setParameter("message", "ДА ПРИБУДЕТ С НАМИ СИЛА!");
        String postId = СreatorForBuilder.getPostID(builderForDelete);
        СreatorForBuilder.createBuilder("delete")
                .setParameter("post_id", postId);
        HttpResponse httpResponse = СreatorForBuilder.getResponse(builderForDelete);
        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);

    }
}



