package marco.U5W3D3.entities.controllers;

import marco.U5W3D3.entities.BlogPost;
import marco.U5W3D3.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogposts")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost saveBlog(@RequestBody BlogPost body) {
        return this.blogPostService.save(body);
    }

}
