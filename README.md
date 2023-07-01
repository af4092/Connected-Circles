# [Connected-Circles](https://en.wikipedia.org/wiki/Overlapping_circles_grid)
Connected Circles Problem was designed using JavaFX and DFS algorithm implementation 

- The connected circles problem is to determine whether all circles in a two-dimensional plane are connected. This problem can be solved using a depth-first traversal.
- The `DFS algorithm` has many applications. This program applies the DFS algorithm to solve the connected circles problem. In the connected circles problem, you determine whether all the circles in a two-dimensional plane are connected. If all the circles are connected, they are painted as filled circles, as shown in Figure. Otherwise, they are not filled.
- We will write a program that lets the user create a circle by clicking a mouse in a blank area that is not currently covered by a circle. As the circles are added, the circles are repainted filled if they are connected or unfilled otherwise. We will create a graph to model the problem. Each circle is a vertex in the graph. Two
circles are connected if they overlap. We apply the DFS in the graph, and if all vertices are found in the depth-first search, the graph is connected.
- Demo run: Circles are created with the click of the mouse, as far as they are connected to each other, paint color is RED:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/233263156-4370e336-6e4e-4f6d-9885-0cfe337271bb.png" alt="Image">
</p>

- Demo run: when connection is lost, when you place the circle far from another one, all circles paint color becomes WHITE:

<p align="center">
  <img src="https://user-images.githubusercontent.com/24220136/233263279-ea4b9208-2f24-40a5-b4a8-0e3d3606d257.png" alt="Image">
</p>

*[DFS - Depth First Search](https://en.wikipedia.org/wiki/Depth-first_search)*
------------------

- The depth-first search of a graph starts from a vertex in the graph and visits all vertices in the graph as far as possible before backtracking. 
- The depth-first search of a graph is like the depth-first search of a tree, Tree Traversal. In the case of a tree, the search starts from the root. In a graph, the search can start from any vertex.
- A depth-first search of a tree first visits the root, then recursively visits the subtrees of the root. Similarly, the depth-first search of a graph first visits a vertex, then it recursively visits all the vertices adjacent to that vertex. The difference is that the graph may contain cycles, which could lead to an infinite recursion. To avoid this problem, you need to track the vertices that have already been visited.
- The search is called depth-first because it searches “deeper” in the graph as much as possible. The search starts from some vertex v. After visiting v, it visits an unvisited neighbor of v. If v has no unvisited neighbor, the search backtracks to the vertex from which it reached v. We assume that the graph is connected and the search starting from any vertex can reach all the vertices. If this is not the case, see Programming Exercise 28.4 for finding connected components in a graph. 
- The `depth-first search` can be used to solve many problems, such as the following:

   ■ Detecting whether a graph is connected. Search the graph starting from any vertex. If the number of vertices searched is the same as the number of vertices in the graph,
the graph is connected. Otherwise, the graph is not connected.

   ■ Detecting whether there is a path between two vertices.
 
   ■ Finding a path between two vertices.
 
   ■ Finding all connected components. A connected component is a maximal connected subgraph in which every pair of vertices are connected by a path.
 
   ■ Detecting whether there is a cycle in the graph.
 
   ■ Finding a cycle in the graph.
 
   ■ Finding a Hamiltonian path/cycle. A Hamiltonian path in a graph is a path that visits each vertex in the graph exactly once. A Hamiltonian cycle visits each vertex in the raph exactly once and returns to the starting vertex. 

- DFS implementation is given in the following directory: `DFS implementation` . And the Java api demo run output:

![image](https://user-images.githubusercontent.com/24220136/233265893-e3922aef-ea6d-4a3f-86d4-cd2246f94712.png)

*[BFS - Breadth First Search](https://en.wikipedia.org/wiki/Breadth-first_search)*
------------------

- The breadth-first search of a graph visits the vertices level by level. The first level consists of the starting vertex. Each next level consists of the vertices adjacent to the vertices in the preceding level.
- The breadth-first traversal of a graph is like the breadth-first traversal of a tree, Tree Traversal. With breadth-first traversal of a tree, the nodes are visited
level by level. First the root is visited, then all the children of the root, then the grandchildren of the root, and so on. Similarly, the breadth-first search of a graph first visits a vertex, then all its adjacent vertices, then all the vertices adjacent to those vertices, and so on. To ensure that each vertex is visited only once, it skips a vertex if it has already been visited.
- Many of the problems solved by the DFS can also be solved using the BFS. Specifically, the `BFS` can be used to solve the following problems:
 
   ■ Detecting whether a graph is connected. A graph is connected if there is a path between any two vertices in the graph.
 
   ■ Detecting whether there is a path between two vertices. 
 
   ■ Finding a shortest path between two vertices. You can prove that the path between the root and any node in the BFS tree is a shortest path between the root and the node. 
 
   ■ Finding all connected components. A connected component is a maximal connected subgraph in which every pair of vertices are connected by a path.
 
   ■ Detecting whether there is a cycle in the graph.
 
   ■ Finding a cycle in the graph.
   
   ■ Testing whether a graph is bipartite. (A graph is bipartite if the vertices of the graph can be divided into two disjoint sets such that no edges exist between vertices in the same set).

- BFS implementation is given in the following directory: `BFS implementation` . And the Java api demo run output:

![image](https://user-images.githubusercontent.com/24220136/233268852-7b8c5786-65f4-4d2c-8b74-f25bd72ce3fc.png)
