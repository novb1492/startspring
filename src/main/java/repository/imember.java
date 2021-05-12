package repository;

import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Optional;

public interface imember {
    Member save(Member member);
    Optional<Member>findbyid(long id);
    Optional<Member>findbyname(String name);
    ArrayList<Member>findall();
}
