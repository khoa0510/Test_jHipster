export interface ICar {
  id?: number;
  make?: string | null;
  model?: string | null;
  price?: string | null;
}

export class Car implements ICar {
  constructor(public id?: number, public make?: string | null, public model?: string | null, public price?: string | null) {}
}

export function getCarIdentifier(car: ICar): number | undefined {
  return car.id;
}
