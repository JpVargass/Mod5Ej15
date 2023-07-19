package cl.jpvs.mod5ej15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.jpvs.mod5ej15.databinding.ItemLayoutBinding


/*
* implementar clase Adapter
* heredar RecyclerView.Adapter
* creaciones de los metodos : onCreateViewHolder, getItemcount y onBindViewHolder
* crear clase anidada ViewHolder, que hereda de la clase ViewHolder
* Agregar constructor
* crear objeto, data class "Pokemon"
* Crear lista
* asignar tamaño de la lista en getItemCount
* */
class Adapter : RecyclerView.Adapter <Adapter.ViewHolder>() {
    var pokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
       this.pokemones = pokedex.toMutableList()
    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
            binding.nombrePokemontxt.text=pokemon.nombre
            binding.tipoPokemontxt.text = pokemon.tipo
        }
    }
}
