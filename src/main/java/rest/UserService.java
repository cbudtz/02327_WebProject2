package rest;

import business.IUserController;
import business.UserController;
import data.IUserDTO;
import data.UserDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserService {
    IUserController userController = new UserController();

    @GET
    public List<IUserDTO> getUserList(){
        return userController.getUsers();
    }

    @GET
    @Path("/{id}")
    public IUserDTO getUser(@PathParam("id") int id){
        //TODO Fill in with real code
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(-1);
        userDTO.setUserName("Dummy2");
        return userDTO;
    }

}
