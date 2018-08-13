package com.example.demo.resource

import org.springframework.data.jpa.repository.JpaRepository
import com.example.demo.model.Users

interface UserRepository : JpaRepository<Users, Long>