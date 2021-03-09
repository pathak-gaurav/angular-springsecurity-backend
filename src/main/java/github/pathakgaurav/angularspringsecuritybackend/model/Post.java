package github.pathakgaurav.angularspringsecuritybackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String title;
    @Lob
    @NotEmpty
    private String content;
    private Instant createdOn;
    private Instant updatedOn;
    @NotBlank
    private String username;

    public Post(@NotBlank String title, @NotEmpty String content, Instant createdOn, Instant updatedOn, @NotBlank String username) {
        this.title = title;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.username = username;
    }
}
