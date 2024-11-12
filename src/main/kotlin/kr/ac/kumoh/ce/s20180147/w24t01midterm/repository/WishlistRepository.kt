package kr.ac.kumoh.ce.s20180147.w24t01midterm.repository

import kr.ac.kumoh.ce.s20180147.w24t01midterm.model.Item

interface WishlistRepository {
  fun findAll(): List<Item>
}