package com.icecream.app.rest.Repository;

import com.icecream.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Task, Long> {
}
