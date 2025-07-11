package com.example.prj250623.board.repository;

import com.example.prj250623.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
  }