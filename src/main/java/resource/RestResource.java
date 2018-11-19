package resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class RestResource {

    @RequestMapping(value="{username}/login", method=RequestMethod.GET, produces="application/json" )
    public ResponseEntity<String> hello(@PathVariable String username)
    {
        return new ResponseEntity<>(username, HttpStatus.OK);
    }
}
