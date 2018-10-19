const hanoiTowerProcedure = (N, from, rest, to) => {
  /** Base Case: N == 1 */
  if (N == 1) return console.log(`Disk 1 : ${from} => ${to}`);
  /** Recursive Case */
  hanoiTowerProcedure(N - 1, from, to, rest);
  console.log(`Disk ${N}: ${from} => ${to}`);
  hanoiTowerProcedure(N - 1, rest, from, to);
}

hanoiTowerProcedure(4, 'A', 'B', 'C');
