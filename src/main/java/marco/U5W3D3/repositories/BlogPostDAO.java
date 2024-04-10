package marco.U5W3D3.repositories;

import marco.U5W3D3.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostDAO extends JpaRepository<BlogPost, Long> {

}
