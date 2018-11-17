package co.highusoft.viveicesi.view.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import co.highusoft.viveicesi.CalificacionActividades;
import co.highusoft.viveicesi.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragActividad.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragActividad#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragActividad extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ImageView imagenActividad;
    Button botonCalificarActividad;
    TextView textViewInformacionActividad;
    CalificacionActividades calificacionActividades;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragActividad() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragActividad.
     */
    // TODO: Rename and change types and number of parameters
    public static FragActividad newInstance(String param1, String param2) {
        FragActividad fragment = new FragActividad();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        calificacionActividades = new CalificacionActividades();

       View viewInflater = inflater.inflate(R.layout.fragment_frag_actividad, null);

        imagenActividad = viewInflater.findViewById(R.id.imagen_actividad);
        textViewInformacionActividad = viewInflater.findViewById(R.id.tv_informacion_actividad);
        botonCalificarActividad = viewInflater.findViewById(R.id.bt_pasar_calificar_actividad);

botonCalificarActividad.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


//        getActivity().getSupportFragmentManager().beginTransaction()
//                .replace(R.id.contenedorFragments,calificacionActividades).commit();

    }
});


//

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_actividad, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}