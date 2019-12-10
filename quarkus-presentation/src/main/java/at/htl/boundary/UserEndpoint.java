package at.htl.boundary;

import at.htl.control.PasswordSecurityUtils;
import at.htl.control.TokenUtils;
import at.htl.control.dao.UserDAO;
import at.htl.entity.MyUser;
import at.htl.restInterface.UserInterface;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@Path("users")
@Transactional
public class UserEndpoint {

    @Inject
    UserDAO userRepo;

    @POST
    public Response createUser(UserInterface ui) {

    }

}
